#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(directory, filename) {
  postHTML('Coverage Report', './fastlane/test_output/xcov_report/', 'index.html')
  publishHTML([allowMissing:          false,
               alwaysLinkToLastBuild: false,
               keepAll:               false,
               reportDir:             directory,
               reportFiles:           filename,
               reportName:            'Coverage Report',
               reportTitles:          ''])
}