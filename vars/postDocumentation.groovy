#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(directory, filename) {
  publishHTML('Documentation', directory, filename)
}