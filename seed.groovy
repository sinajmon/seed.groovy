multibranchPipelineJob('configuration-webapp-s3') {
  branchSources {
      git {
          id = 'demo-react-ui'
          remote('https://github.com/sinajmon/demo-react-ui.git')
      }
  }
}
