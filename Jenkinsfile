node {
    stage 'git'
        git 'https://github.com/gnuzman/spring-boot-web.git'
    stage 'mvn'
        sh "'mvn' clean package"

    stage 'docker build'
        sh '''
            docker build -t 192.168.42.2:5000/test2 --no-cache=true .
        '''
    stage 'docker push'
        sh '''
            docker push 192.168.42.2:5000/test2
        '''

}