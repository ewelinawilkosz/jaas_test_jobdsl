job('testjob-1') {
	scm {
		github 'ewelinawilkosz2/jaas_test'
	}
	triggers {
		'*/5 * * * *'
	}
	steps {
		shell(readFileFromWorkspace('*'))
	}
}