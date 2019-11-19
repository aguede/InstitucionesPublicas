CREATE TABLE files (
    id_file                INTEGER NOT NULL AUTO_INCREMENT,
    lds_filename           VARCHAR2(50) NOT NULL,
    ds_status              VARCHAR2(20) NOT NULL,
    lds_rejection_reason   VARCHAR2(50),
    f_remittance_id        INTEGER,
    dt_last_update         DATE NOT NULL,
    cd_user_last_update    VARCHAR2(20) NOT NULL,
    dt_creation_date       DATE NOT NULL,
    cd_creation_user       VARCHAR2(20) NOT NULL
);
ALTER TABLE files ADD CONSTRAINT files_pk PRIMARY KEY ( id_file );
CREATE TABLE operation_status (
    id_status             INTEGER NOT NULL AUTO_INCREMENT,
    ds_status             VARCHAR2(50) NOT NULL,
    dt_last_update        DATE NOT NULL,
    cd_user_last_update   VARCHAR2(20) NOT NULL,
    dt_creation_date      DATE NOT NULL,
    cd_creation_user      VARCHAR2(20) NOT NULL
);
ALTER TABLE operation_status ADD CONSTRAINT operation_status_pk PRIMARY KEY ( id_status );
CREATE TABLE operations (
    id_operation                   INTEGER NOT NULL AUTO_INCREMENT,
    lcd_sepa_operation_id          VARCHAR2(35) NOT NULL,
    f_operation_amount             NUMBER(16, 2) NOT NULL,
    lds_payer_name                 VARCHAR2(50) NOT NULL,
    lds_beneficiary_name           VARCHAR2(50) NOT NULL,
    b_beneficiary_type             CHAR(1) NOT NULL,
    cd_beneficiary_document        VARCHAR2(9) NOT NULL,
    f_beneficiary_owner_type       INTEGER NOT NULL,
    cd_beneficiary_iban            VARCHAR2(4),
    cd_beneficiary_ccc             VARCHAR2(30) NOT NULL,
    lds_last_beneficiary_name      VARCHAR2(50),
    cd_last_beneficiary_document   VARCHAR2(9),
    lds_concept                    VARCHAR2(50),
    id_remittance                  INTEGER NOT NULL,
    id_status                      INTEGER NOT NULL,
    dt_status_last_update          DATE NOT NULL,
    b_p7_operation                 NUMBER not NULL,
    dt_last_update                 DATE NOT NULL,
    cd_user_last_update            VARCHAR2(20) NOT NULL,
    dt_creation_date               DATE NOT NULL,
    cd_creation_user               VARCHAR2(20) NOT NULL
);
ALTER TABLE operations ADD CONSTRAINT operations_pk PRIMARY KEY ( id_operation );
ALTER TABLE operations ADD CONSTRAINT operations__un UNIQUE ( lcd_sepa_operation_id );
CREATE TABLE redirected_operations (
    id_operation          INTEGER NOT NULL AUTO_INCREMENT,
    id_redirect           INTEGER NOT NULL,
    dt_last_update        DATE NOT NULL,
    cd_user_last_update   VARCHAR2(20) NOT NULL,
    dt_creation_date      DATE NOT NULL,
    cd_creation_user      VARCHAR2(20) NOT NULL
);
ALTER TABLE redirected_operations ADD CONSTRAINT redirected_operations_pk PRIMARY KEY ( id_operation,
                                                                                        id_redirect );
CREATE TABLE redirections (
    id_redirect           INTEGER NOT NULL AUTO_INCREMENT,
    cd_previous_iban      VARCHAR2(20),
    cd_previous_ccc       VARCHAR2(20) NOT NULL,
    cd_new_iban           VARCHAR2(20),
    cd_new_ccc            VARCHAR2(20) NOT NULL,
    b_flag_active         CHAR(1) NOT NULL,
    dt_last_update        DATE NOT NULL,
    cd_user_last_update   VARCHAR2(20) NOT NULL,
    dt_creation_date      DATE NOT NULL,
    cd_creation_user      VARCHAR2(20) NOT NULL
);
ALTER TABLE redirections ADD CONSTRAINT redirections_pk PRIMARY KEY ( id_redirect );
CREATE TABLE refunds (
    id_refund              INTEGER NOT NULL AUTO_INCREMENT,
    dt_refund_date         DATE NOT NULL,
    lds_refund_reason      VARCHAR2(50) NOT NULL,
    id_operation           INTEGER NOT NULL,
    dt_last_update         DATE NOT NULL,
    cd_usaer_last_update   VARCHAR2(20) NOT NULL,
    dt_creation_date       DATE NOT NULL,
    cd_creation_user       VARCHAR2(20) NOT NULL
);
ALTER TABLE refunds ADD CONSTRAINT setbacks_pk PRIMARY KEY ( id_refund );
CREATE TABLE remittance_status (
    id_status             INTEGER NOT NULL AUTO_INCREMENT,
    ds_status             VARCHAR2(20) NOT NULL,
    dt_last_update        DATE NOT NULL,
    cd_user_last_update   VARCHAR2(20) NOT NULL,
    dt_creation_date      DATE NOT NULL,
    cd_creation_user      VARCHAR2(20) NOT NULL
);
ALTER TABLE remittance_status ADD CONSTRAINT remittance_status_pk PRIMARY KEY ( id_status );
CREATE TABLE remittance_types (
    id_type               INTEGER NOT NULL AUTO_INCREMENT,
    cd_type               VARCHAR2(4) NOT NULL,
    ds_type               VARCHAR2(20) NOT NULL,
    dt_last_update        DATE NOT NULL,
    cd_user_last_update   VARCHAR2(20) NOT NULL,
    dt_creation_date      DATE NOT NULL,
    cd_creation_user      VARCHAR2(20) NOT NULL
);
ALTER TABLE remittance_types ADD CONSTRAINT remittance_types_pk PRIMARY KEY ( id_type );
CREATE TABLE remittances (
    id_remittance                 INTEGER NOT NULL AUTO_INCREMENT,
    lcd_sepa_message_id           VARCHAR2(35) NOT NULL,
    dt_sepa_file_creation_date    DATE NOT NULL,
    f_num_operations              INTEGER NOT NULL,
    f_checksum                    NUMBER(16, 2) NOT NULL,
    lds_initiating_part_name      VARCHAR2(50),
    lcd_initianing_part_id        VARCHAR2(50),
    lcd_sepa_payment_id           VARCHAR2(35) NOT NULL,
    cd_payment_method             VARCHAR2(3) NOT NULL,
    cd_account_indicator          VARCHAR2(5),
    cd_service_level_code         VARCHAR2(5),
    cd_transfer_type_code         VARCHAR2(4) NOT NULL,
    id_type                       INTEGER NOT NULL,
    id_status                     INTEGER NOT NULL,
    dt_operation_execution_date   DATE NOT NULL,
    lds_payer_name                VARCHAR2(50) NOT NULL,
    lds_payer_address             VARCHAR2(50) NOT NULL,
    lcd_payer_id                  VARCHAR2(50) NOT NULL,
    cd_payer_iban                 VARCHAR2(20) NOT NULL,
    cd_payer_ccc                  VARCHAR2(20) NOT NULL,
    cd_payer_entity_id            VARCHAR2(20) NOT NULL,
    dt_last_update                DATE NOT NULL,
    cd_user_last_update           VARCHAR2(20) NOT NULL,
    dt_creation_date              DATE NOT NULL,
    cd_creation_user              VARCHAR2(20) NOT NULL
);
ALTER TABLE remittances ADD CONSTRAINT remittances_pk PRIMARY KEY ( id_remittance );
ALTER TABLE remittances ADD CONSTRAINT remittances__un UNIQUE ( lcd_sepa_payment_id );
CREATE TABLE sepa_errors (
    id_sepa_error           INTEGER NOT NULL AUTO_INCREMENT,
    cd_sepa_error_code      VARCHAR2(20) NOT NULL,
    lds_error_description   VARCHAR2(20) NOT NULL,
    dt_last_update          DATE NOT NULL,
    cd_user_last_update     VARCHAR2(20) NOT NULL,
    dt_creation_date        DATE NOT NULL,
    cd_creation_user        VARCHAR2(20) NOT NULL
);
ALTER TABLE sepa_errors ADD CONSTRAINT sepa_errors_pk PRIMARY KEY ( id_sepa_error );
CREATE TABLE tgss_account (
    id_tgss_account         INTEGER NOT NULL AUTO_INCREMENT,
    ds_origin_account       VARCHAR2(20) NOT NULL,
    ds_transitory_account   VARCHAR2(20) NOT NULL,
    ds_repair_account       VARCHAR2(20) NOT NULL,
    id_remittance_type      INTEGER NOT NULL,
    dt_last_update          DATE NOT NULL,
    cd_user_last_update     VARCHAR2(20) NOT NULL,
    dt_creation_date        DATE NOT NULL,
    cd_creation_user        DATE NOT NULL
);
ALTER TABLE tgss_account ADD CONSTRAINT tgss_account_pk PRIMARY KEY ( id_tgss_account );
CREATE TABLE transaction_codes (
    id_transfer_code             INTEGER NOT NULL AUTO_INCREMENT,
    cd_client_code               VARCHAR2(20) NOT NULL,
    cd_bank_code                 VARCHAR2(20) NOT NULL,
    cd_closure_accounting_code   VARCHAR2(20) NOT NULL,
    cd_ss_account_code           VARCHAR2(20) NOT NULL,
    cd_unpaid_accounting_code    VARCHAR2(20) NOT NULL,
    cd_ss_unpaid_account_code    VARCHAR2(20) NOT NULL,
    dt_last_update               DATE NOT NULL,
    cd_user_last_update          VARCHAR2(20) NOT NULL,
    dt_creation_date             DATE NOT NULL,
    cd_creation_user             VARCHAR2(20) NOT NULL
);
ALTER TABLE transaction_codes ADD CONSTRAINT transaction_codes_pk PRIMARY KEY ( id_transfer_code );
CREATE TABLE transactions (
    id_transaction          INTEGER NOT NULL AUTO_INCREMENT,
    ds_account_from         VARCHAR2(20) NOT NULL,
    ds_account_to           VARCHAR2(20) NOT NULL,
    cd_transfer_code_from   VARCHAR2(20) NOT NULL,
    cd_transfer_code_to     VARCHAR2(20) NOT NULL,
    dt_execution_date       DATE NOT NULL,
    f_amount                NUMBER(16, 2) NOT NULL,
    id_operation            INTEGER NOT NULL,
    dt_last_update          DATE NOT NULL,
    cd_user_last_update     VARCHAR2(20) NOT NULL,
    dt_creation_date        DATE NOT NULL,
    cd_creation_user        VARCHAR2(20) NOT NULL
);
ALTER TABLE transactions ADD CONSTRAINT transactions_pk PRIMARY KEY ( id_transaction );
ALTER TABLE tgss_account
    ADD CONSTRAINT account_remittance_types_fk FOREIGN KEY ( id_remittance_type )
        REFERENCES remittance_types ( id_type );
ALTER TABLE redirected_operations
    ADD CONSTRAINT operations_fk FOREIGN KEY ( id_operation )
        REFERENCES operations ( id_operation );
ALTER TABLE operations
    ADD CONSTRAINT operations_operation_status_fk FOREIGN KEY ( id_status )
        REFERENCES operation_status ( id_status );
ALTER TABLE operations
    ADD CONSTRAINT operations_remittances_fk FOREIGN KEY ( id_remittance )
        REFERENCES remittances ( id_remittance );
ALTER TABLE redirected_operations
    ADD CONSTRAINT redirections_fk FOREIGN KEY ( id_redirect )
        REFERENCES redirections ( id_redirect );
ALTER TABLE refunds
    ADD CONSTRAINT refunds_operations_fk FOREIGN KEY ( id_operation )
        REFERENCES operations ( id_operation );
ALTER TABLE remittances
    ADD CONSTRAINT remittance_status_fk FOREIGN KEY ( id_status )
        REFERENCES remittance_status ( id_status );
ALTER TABLE remittances
    ADD CONSTRAINT remittance_types_fk FOREIGN KEY ( id_type )
        REFERENCES remittance_types ( id_type );
ALTER TABLE transactions
    ADD CONSTRAINT transactions_operations_fk FOREIGN KEY ( id_operation )
        REFERENCES operations ( id_operation );