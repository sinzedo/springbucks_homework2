package springbucks.common;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Resp<T> {

    private int errcode;
    private String errmsg;
    private T data;

    private static int SUCC = 0;
    private static int FAIL = -1;

    public Resp(int errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public Resp(int errcode, String errmsg, T data) {
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = data;
    }

    public static <F> Resp<F> Success(F data) {
        return new Resp(SUCC,"success",data);
    }

    public boolean IsSucc() {
        if(this.errcode != SUCC) {
            return false;
        }
        return true;
    }

    public static <F> Resp<F> Fail(F data) {
        return new Resp(FAIL,"fail",data);
    }

    public static Resp Fail(int errcode, String errmsg) {
        return new Resp(errcode,errmsg);
    }

    public static <F> Resp<F> Fail(int code,F data) {
        return new Resp(FAIL,"fail",data);
    }
}
