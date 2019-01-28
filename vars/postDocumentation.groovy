#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

import package com.matthiaszarzecki.jenkinsLibrary.*

def call(directory, filename) {
  postHTML('Documentation', directory, filename)
}