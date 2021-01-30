job('NodeJS example') {
    scm {
        git('https://github.com/VishakhHS/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('VishakhHS')
            node / gitConfigEmail('vishakh.shewalkar@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('Nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
