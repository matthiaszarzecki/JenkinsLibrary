#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

import com.matthiaszarzecki.jenkinsLibrary

def call(directory, filename) {
  postHTML('Documentation', directory, filename)
}