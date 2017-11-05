package wechatorderdemo.sell.dataobject;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author yinywf
 * Created on 2017/10/11
 */

@Converter(autoApply = true)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    @Override
    public java.sql.Timestamp convertToDatabaseColumn(java.time.LocalDateTime entityValue) {
        return entityValue == null ? null : java.sql.Timestamp.valueOf(entityValue);
    }

    @Override
    public java.time.LocalDateTime convertToEntityAttribute(java.sql.Timestamp dbValue) {
        return dbValue == null ? null : dbValue.toLocalDateTime();
    }
}