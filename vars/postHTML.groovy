#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(displayName, directory, filename) {
  publishHTML([allowMissing:          false,
               alwaysLinkToLastBuild: false,
               keepAll:               false,
               reportDir:             directory,
               reportFiles:           filename,
               reportName:            displayName,
               reportTitles:          ''])
}