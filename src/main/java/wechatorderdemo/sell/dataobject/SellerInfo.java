package wechatorderdemo.sell.dataobject;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author yinywf
 * Created on 2017/10/26
 */
@Entity
@Table(name = "seller_info", schema = "sell")
public class SellerInfo implements Serializable{
    private static final long serialVersionUID = 1018584303667848154L;
    private String id;
    private String username;
    private String password;
    private String openid;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "create_time")
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SellerInfo that = (SellerInfo) o;

        if (!id.equals(that.id)) {
            return false;
        }
        if (!username.equals(that.username)) {
            return false;
        }
        if (!password.equals(that.password)) {
            return false;
        }
        if (!openid.equals(that.openid)) {
            return false;
        }
        if (!createTime.equals(that.createTime)) {
            return false;
        }
        return updateTime.equals(that.updateTime);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
