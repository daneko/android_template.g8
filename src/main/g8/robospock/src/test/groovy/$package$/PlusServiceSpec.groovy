package $package$

import spock.lang.Specification

class PlusServiceSpec extends Specification{

    def "sample"(){
        given:
        def service = PlusService.of(1,1)

        when:
        def target = service.plus()

        then:
        target == 2
    }
}
