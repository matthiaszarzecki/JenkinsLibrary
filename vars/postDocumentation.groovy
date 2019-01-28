#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

import package com.matthiaszarzecki.postHTML

def call(directory, filename) {
  postHTML('Documentation', directory, filename)
}