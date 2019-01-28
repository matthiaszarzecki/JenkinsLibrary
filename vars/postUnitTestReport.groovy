#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(directory, filename) {
  postHTML('Unit Test Report', directory, filename)
}