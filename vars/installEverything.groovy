#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(file) {
  sh 'bundle install'
  sh 'pod install'
  sh 'bundle update fastlane'
}