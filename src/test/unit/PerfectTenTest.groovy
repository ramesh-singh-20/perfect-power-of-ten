import com.alphacoder.main.PerfectTen
import spock.lang.Specification

class PerfectTenTest extends Specification{

    def 'Test PerfectTen | Number is less than 10'(){
        given:
        def perfectTen= new PerfectTen()

        when:
        def result= perfectTen.isPerfectPowerOfTen(9)

        then:
        !result

    }

    def 'Test PerfectTen | Number is equal to 10'(){
        given:
        def perfectTen= new PerfectTen()

        when:
        def result= perfectTen.isPerfectPowerOfTen(10)

        then:
        result

    }

    def 'Test PerfectTen | Number is greater than 10 | Failed'(){
        given:
        def perfectTen= new PerfectTen()

        when:
        def result= perfectTen.isPerfectPowerOfTen(20)

        then:
        !result

    }

    def 'Test PerfectTen | Number is greater than 1000 | Success'(){
        given:
        def perfectTen= new PerfectTen()

        when:
        def result= perfectTen.isPerfectPowerOfTen(1000)

        then:
        result

    }

    def 'Test PerfectTen | Number is less than 1000 | Failed'(){
        given:
        def perfectTen= new PerfectTen()

        when:
        def result= perfectTen.isPerfectPowerOfTen(900)

        then:
        !result

    }
}
