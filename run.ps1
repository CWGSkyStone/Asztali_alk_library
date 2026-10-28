<#
File: run.ps1
Author: Szabó József
Copyright: 2026, Szabó József
Group: Szoft II/N
Date: 2026-10-28
Github: https://github.com/CWGSkyStone/
Licenc: MIT
#>

$ErrorActionPreference = 'Stop'

Push-Location $PSScriptRoot
try {
    $compilerPath = (Get-Command javac -ErrorAction Stop).Source
    $runtimePath = Join-Path (Split-Path $compilerPath) 'java.exe'
    New-Item -ItemType Directory -Path 'bin' -Force | Out-Null
    $sourceFiles = Get-ChildItem -LiteralPath 'src' -Filter '*.java'

    & $compilerPath --release 17 -encoding UTF-8 -cp 'lib/*' -d bin $sourceFiles.FullName
    if ($LASTEXITCODE -ne 0) {
        exit $LASTEXITCODE
    }

    & $runtimePath --enable-native-access=ALL-UNNAMED '-Dfile.encoding=UTF-8' -cp 'bin;lib/*' App
    exit $LASTEXITCODE
} finally {
    Pop-Location
}
