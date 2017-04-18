#!/usr/bin/env bash

set -e

mkdir temp && cd temp
curl -o google-cloud-sdk.tar.gz https://dl.google.com/dl/cloudsdk/channels/rapid/downloads/google-cloud-sdk-151.0.1-darwin-x86_64.tar.gz
unzip google-cloud-sdk.tar.gz

#ADD google-cloud-sdk to PATH
#ADD google-cloud-sdk completions



