#!/bin/bash

set -e

./gradlew clean test jacocoTestReport
open build/jacocoHtml/index.html
