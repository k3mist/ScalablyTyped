package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --设置
trait AuthSetting extends js.Object {
  /**
    * 通讯地址，对应接口 wx.chooseAddress
    */
  var `scope.address`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 摄像头 wx.camera
    */
  var `scope.camera`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 发票抬头，对应接口 wx.chooseInvoiceTitle
    */
  var `scope.invoiceTitle`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 录音功能，对应接口 wx.startRecord
    */
  var `scope.record`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 用户信息，对应接口 wx.getUserInfo
    */
  var `scope.userInfo`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 地理位置，对应接口 wx.getLocation wx.chooseLocation
    */
  var `scope.userLocation`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 微信运动步数，对应接口 wx.getWeRunData
    */
  var `scope.werun`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum
    */
  var `scope.writePhotosAlbum`: js.UndefOr[scala.Boolean] = js.undefined
}

object AuthSetting {
  @scala.inline
  def apply(
    `scope.address`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.camera`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.invoiceTitle`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.record`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.userInfo`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.userLocation`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.werun`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.writePhotosAlbum`: js.UndefOr[scala.Boolean] = js.undefined
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`scope.address`)) __obj.updateDynamic("scope.address")(`scope.address`)
    if (!js.isUndefined(`scope.camera`)) __obj.updateDynamic("scope.camera")(`scope.camera`)
    if (!js.isUndefined(`scope.invoiceTitle`)) __obj.updateDynamic("scope.invoiceTitle")(`scope.invoiceTitle`)
    if (!js.isUndefined(`scope.record`)) __obj.updateDynamic("scope.record")(`scope.record`)
    if (!js.isUndefined(`scope.userInfo`)) __obj.updateDynamic("scope.userInfo")(`scope.userInfo`)
    if (!js.isUndefined(`scope.userLocation`)) __obj.updateDynamic("scope.userLocation")(`scope.userLocation`)
    if (!js.isUndefined(`scope.werun`)) __obj.updateDynamic("scope.werun")(`scope.werun`)
    if (!js.isUndefined(`scope.writePhotosAlbum`)) __obj.updateDynamic("scope.writePhotosAlbum")(`scope.writePhotosAlbum`)
    __obj.asInstanceOf[AuthSetting]
  }
}

