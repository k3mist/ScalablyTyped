package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * wx.getUserInfo的旧版本API参数，随时会被删除，不推荐使用
  */
trait OldUserInfoParam extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.en | wegameDashApiLib.wegameDashApiLibStrings.zh_CN | wegameDashApiLib.wegameDashApiLibStrings.zh_TW
  ] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_EncryptedData, scala.Unit]] = js.undefined
  /**
    * 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。
    */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object OldUserInfoParam {
  @scala.inline
  def apply(
    complete: js.Function0[scala.Unit] = null,
    fail: js.Function0[scala.Unit] = null,
    lang: wegameDashApiLib.wegameDashApiLibStrings.en | wegameDashApiLib.wegameDashApiLibStrings.zh_CN | wegameDashApiLib.wegameDashApiLibStrings.zh_TW = null,
    success: js.Function1[/* res */ wegameDashApiLib.Anon_EncryptedData, scala.Unit] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): OldUserInfoParam = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[OldUserInfoParam]
  }
}

