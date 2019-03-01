package typings
package atPulumiAwsLib.elastictranscoderPresetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetArgs extends js.Object {
  /**
    * Audio parameters object (documented below).
    */
  val audio: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AudioPackingModeBitRate]] = js.undefined
  /**
    * Codec options for the audio parameters (documented below)
    */
  val audioCodecOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BitDepthBitOrder]] = js.undefined
  /**
    * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
    */
  val container: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A description of the preset (maximum 255 characters)
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the preset. (maximum 40 characters)
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Thumbnail parameters object (documented below)
    */
  val thumbnails: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AspectRatioFormat]] = js.undefined
  val `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Video parameters object (documented below)
    */
  val video: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AspectRatioBitRateCodec]] = js.undefined
  val videoCodecOptions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Watermark parameters for the video parameters (documented below)
    * * `video_codec_options` (Optional, Forces new resource) Codec options for the video parameters
    */
  val videoWatermarks: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HorizontalAlignHorizontalOffset]
      ]
    ]
  ] = js.undefined
}

object PresetArgs {
  @scala.inline
  def apply(
    container: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    audio: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AudioPackingModeBitRate] = null,
    audioCodecOptions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BitDepthBitOrder] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    thumbnails: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AspectRatioFormat] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    video: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AspectRatioBitRateCodec] = null,
    videoCodecOptions: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    videoWatermarks: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HorizontalAlignHorizontalOffset]
      ]
    ] = null
  ): PresetArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (audioCodecOptions != null) __obj.updateDynamic("audioCodecOptions")(audioCodecOptions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoCodecOptions != null) __obj.updateDynamic("videoCodecOptions")(videoCodecOptions.asInstanceOf[js.Any])
    if (videoWatermarks != null) __obj.updateDynamic("videoWatermarks")(videoWatermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetArgs]
  }
}

