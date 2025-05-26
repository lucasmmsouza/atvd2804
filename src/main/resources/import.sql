INSERT INTO paciente (id, nome, telefone) VALUES (1, 'João Silva', '99999-1111');
INSERT INTO paciente (id, nome, telefone) VALUES (2, 'Maria Souza', '88888-2222');

INSERT INTO medico (id, nome, crm) VALUES (1, 'Dra. Ana', '12345');
INSERT INTO medico (id, nome, crm) VALUES (2, 'Dr. Carlos', '67890');

INSERT INTO consulta (id, data, valor, observacao, paciente_id, medico_id) VALUES (1, '2024-06-01T10:00:00', 200.0, 'Primeira consulta', 1, 1);
INSERT INTO consulta (id, data, valor, observacao, paciente_id, medico_id) VALUES (2, '2024-06-02T14:00:00', 250.0, 'Retorno', 2, 2);