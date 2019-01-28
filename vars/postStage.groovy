#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(stageName) {
  echo "###################### Stage: " + stageName
}