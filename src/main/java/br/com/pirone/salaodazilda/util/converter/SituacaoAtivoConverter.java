package br.com.pirone.salaodazilda.util.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.com.pirone.salaodazilda.enums.SituacaoAtivo;

@Converter(autoApply=true)
public class SituacaoAtivoConverter implements AttributeConverter<SituacaoAtivo, String> {
 
    @Override
    public String convertToDatabaseColumn(SituacaoAtivo attribute) {
    	if (attribute == SituacaoAtivo.ATIVO || attribute == null) {
			return "S";
		} else {
			return "N";
		}
    }
 
    @Override
    public SituacaoAtivo convertToEntityAttribute(String dbData) {
        switch (dbData) {
            case "S":
                return SituacaoAtivo.ATIVO;
            case "N":
                return SituacaoAtivo.INATIVO;
            case "null":
            	return null;
            default:
                throw new IllegalArgumentException("Unknown" + dbData);
        }
    }

}
