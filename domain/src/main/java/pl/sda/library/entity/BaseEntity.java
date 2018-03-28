package pl.sda.library.entity;


public abstract class BaseEntity {



    private Long version;

        public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
