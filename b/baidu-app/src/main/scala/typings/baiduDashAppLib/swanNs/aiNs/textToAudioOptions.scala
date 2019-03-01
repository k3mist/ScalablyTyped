package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 将文本转换为可以播放的mp3文件。
		 */
trait textToAudioOptions
  extends baiduDashAppLib.swanNs.BaseOptions[js.Any, js.Any] {
   // 合成的文本，使用UTF-8编码，小于512个中文字或者英文数字（文本在百度服务器内转换为GBK后，长度必须小于1024字节）。
  var ctp: js.UndefOr[java.lang.String | scala.Double] = js.undefined
   // 客户端类型选择，Web端填写固定值1。
  var lan: js.UndefOr[java.lang.String] = js.undefined
   // 音量，取值0-9，默认为5中音量。
  var per: js.UndefOr[java.lang.String] = js.undefined
   // 语速，取值0-9，默认为5中语速。
  var pit: js.UndefOr[java.lang.String] = js.undefined
   // 固定值zh。语言选择,目前只有中英文混合模式，填写固定值zh。
  var spd: js.UndefOr[java.lang.String] = js.undefined
   // 发音人选择, 0为普通女声，1为普通男生，3为情感合成-度逍遥，4为情感合成-度丫丫，默认为普通女声。
  @JSName("success")
  var success_textToAudioOptions: js.UndefOr[js.Function1[/* res */ textToAudioResponse, scala.Unit]] = js.undefined
  var tex: java.lang.String
   // 音调，取值0-9，默认为5中语调。
  var vol: js.UndefOr[java.lang.String] = js.undefined
}

object textToAudioOptions {
  @scala.inline
  def apply(
    tex: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    ctp: java.lang.String | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    lan: java.lang.String = null,
    per: java.lang.String = null,
    pit: java.lang.String = null,
    spd: java.lang.String = null,
    success: js.Function1[/* res */ textToAudioResponse, scala.Unit] = null,
    vol: java.lang.String = null
  ): textToAudioOptions = {
    val __obj = js.Dynamic.literal(tex = tex)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (ctp != null) __obj.updateDynamic("ctp")(ctp.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (lan != null) __obj.updateDynamic("lan")(lan)
    if (per != null) __obj.updateDynamic("per")(per)
    if (pit != null) __obj.updateDynamic("pit")(pit)
    if (spd != null) __obj.updateDynamic("spd")(spd)
    if (success != null) __obj.updateDynamic("success")(success)
    if (vol != null) __obj.updateDynamic("vol")(vol)
    __obj.asInstanceOf[textToAudioOptions]
  }
}

