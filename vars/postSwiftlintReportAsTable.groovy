#!/usr/local/bin groovy
package com.matthiaszarzecki.jenkinsLibrary

def call(tablePath) {
  checkstyle canComputeNew:   false,
             defaultEncoding: '',
             healthy:         '',
             pattern:         tablePath,
             unHealthy:       ''
}