package top.d3rc.https.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVO<T> {

    private String msg;

    private T data;

    private ResponseVO(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseVO<T> ok(T data) {
        return new ResponseVO(null, data);
    }

    public static <T> ResponseVO<T> ok(String msg, T data) {
        return new ResponseVO(msg, data);
    }
}
