multibranchPipelineJob('configuration-code-dev') {
  branchSources {
      git {
          id = 'develop'
          remote('https://github.com/sinajmon/static-webhosting-s3-demo.git')
      }
  }
}
