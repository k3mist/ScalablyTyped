package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  	// 压缩图片的最大宽度值
  var maxHeight: scala.Double
  	// 图片压缩质量，在图片格式为 image/jpeg 或 image/webp 的情况下生效，其他格式不会生效，可以从 0 到 1 的区间内选择图片的质量。默认值 0.92
  var maxWidh: scala.Double
  	// 压缩图片的最大高度值 （注意：当 maxWidth 和 maxHeight 都不设置时，则采用原图尺寸大小）
  var noCompressIfLarger: scala.Boolean
  var quality: scala.Double
}

object CompressOptions {
  @scala.inline
  def apply(
    maxHeight: scala.Double,
    maxWidh: scala.Double,
    noCompressIfLarger: scala.Boolean,
    quality: scala.Double
  ): CompressOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight, maxWidh = maxWidh, noCompressIfLarger = noCompressIfLarger, quality = quality)
  
    __obj.asInstanceOf[CompressOptions]
  }
}

