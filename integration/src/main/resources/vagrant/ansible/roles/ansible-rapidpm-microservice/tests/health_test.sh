#!/bin/bash
set -e

# get helthpage
curl -XGET 'http://localhost:7081/rest/metrics/health' | grep "/metrics/health"

