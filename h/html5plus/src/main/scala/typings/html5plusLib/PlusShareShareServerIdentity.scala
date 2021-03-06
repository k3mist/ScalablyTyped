package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 分享服务标识
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareShareServerIdentity extends js.Object {
  /**
    * 新浪微博
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var sinaweibo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 腾讯微博
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var tencentweibo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 微信
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var weixin: js.UndefOr[java.lang.String] = js.undefined
}

object PlusShareShareServerIdentity {
  @scala.inline
  def apply(
    sinaweibo: java.lang.String = null,
    tencentweibo: java.lang.String = null,
    weixin: java.lang.String = null
  ): PlusShareShareServerIdentity = {
    val __obj = js.Dynamic.literal()
    if (sinaweibo != null) __obj.updateDynamic("sinaweibo")(sinaweibo)
    if (tencentweibo != null) __obj.updateDynamic("tencentweibo")(tencentweibo)
    if (weixin != null) __obj.updateDynamic("weixin")(weixin)
    __obj.asInstanceOf[PlusShareShareServerIdentity]
  }
}

