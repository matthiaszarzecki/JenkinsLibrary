#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(resultPath) {
  checkstyle canComputeNew:   false,
             defaultEncoding: '',
             healthy:         '',
             pattern:         resultPath,
             unHealthy:       ''
}