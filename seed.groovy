multibranchPipelineJob('configuration-code-dev') {
  branchSources {
      git {
          id = 'develop'
          remote('https://github.com/sinajmon/develop.git')
      }
  }
}
