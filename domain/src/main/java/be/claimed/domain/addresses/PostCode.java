package be.claimed.domain.addresses;

import be.claimed.domain.entities.AbstractEntity;

import java.util.UUID;

public class PostCode extends AbstractEntity {

    private String postCode;
    private String label;

    public PostCode(PostCodeBuilder postCodeBuilder) {
        super(postCodeBuilder.postCodeId);
        postCode = postCodeBuilder.postCode;
        label = postCodeBuilder.label;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getLabel() {
        return label;
    }

    public static class PostCodeBuilder {
        private UUID postCodeId;
        private String postCode;
        private String label;

        public static PostCodeBuilder postCode() {
            return new PostCodeBuilder();
        }

        public PostCode build() {
            return new PostCode(this);
        }

        public PostCodeBuilder withPostCodeId(UUID postCodeId) {
            this.postCodeId = postCodeId;
            return this;
        }

        public PostCodeBuilder withPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public PostCodeBuilder withLabel(String label) {
            this.label = label;
            return this;
        }
    }
}
