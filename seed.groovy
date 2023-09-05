multibranchPipelineJob('configuration-webapp-s3') {
  branchSources {
      git {
          id = 'static-webhosting-s3-demo'
          remote('https://github.com/sinajmon/static-webhosting-s3-demo.git')
      }
  }
}
