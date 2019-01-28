#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(status) {
  if (status == "success") {
    color   = "good"
    outcome = "Successful"
  } else if (status == "failed") {
    color   = "danger"
    outcome = "Failed"
  } else {
    color   = "warning"
    outcome = "Built, but unstable"
  }

  slackSend channel:    SLACK_CHANNEL,
            color:      color,
            message:    'Advice App >> ' + BRANCH_NAME + ' - Build #' + BUILD_NUMBER + ' ' + outcome + '! at ' + BUILD_TIMESTAMP,
            teamDomain: SLACK_DOMAIN,
            token:      SLACK_TOKEN
}