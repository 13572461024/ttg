package cn.itsource.ttg.util;

public class AjaxResult {
    private boolean success=true;
    private String message;

//    可以用于我们返回给前台时传递数据
    private Object returnObject;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

//    返回ajaxResult  方便链式编程
    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getReturnObject() {
        return returnObject;
    }

    public AjaxResult setReturnObject(Object retrunObject) {
        this.returnObject = retrunObject;
        return this;
    }

//  调用静态方法获得ajaxResult对象
    public static AjaxResult me(){
        return new AjaxResult();
    }
}
