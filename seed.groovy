multibranchPipelineJob('configuration-webcode-s3') {
  branchSources {
      git {
          id = 'develop'
          remote('https://github.com/sinajmon/static-webhosting-s3-demo.git')
      }
  }
}
