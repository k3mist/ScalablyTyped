package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_compressed_texture_s3tc extends js.Object {
  val COMPRESSED_RGBA_S3TC_DXT1_EXT: GLenum
  val COMPRESSED_RGBA_S3TC_DXT3_EXT: GLenum
  val COMPRESSED_RGBA_S3TC_DXT5_EXT: GLenum
  val COMPRESSED_RGB_S3TC_DXT1_EXT: GLenum
}

object WEBGL_compressed_texture_s3tc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_S3TC_DXT1_EXT: GLenum,
    COMPRESSED_RGBA_S3TC_DXT3_EXT: GLenum,
    COMPRESSED_RGBA_S3TC_DXT5_EXT: GLenum,
    COMPRESSED_RGB_S3TC_DXT1_EXT: GLenum
  ): WEBGL_compressed_texture_s3tc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_S3TC_DXT1_EXT = COMPRESSED_RGBA_S3TC_DXT1_EXT, COMPRESSED_RGBA_S3TC_DXT3_EXT = COMPRESSED_RGBA_S3TC_DXT3_EXT, COMPRESSED_RGBA_S3TC_DXT5_EXT = COMPRESSED_RGBA_S3TC_DXT5_EXT, COMPRESSED_RGB_S3TC_DXT1_EXT = COMPRESSED_RGB_S3TC_DXT1_EXT)
  
    __obj.asInstanceOf[WEBGL_compressed_texture_s3tc]
  }
}

