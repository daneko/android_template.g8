package $package$;

import javax.annotation.Nonnull;

import lombok.Value;

@Value(staticConstructor = "of")
public class PlusService {

    Integer a;
    Integer b;

    @Nonnull
    public Integer plus(){
        return this.a + this.b;
    }
}

