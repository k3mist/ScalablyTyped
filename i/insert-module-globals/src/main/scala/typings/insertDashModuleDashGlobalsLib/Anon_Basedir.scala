package typings
package insertDashModuleDashGlobalsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basedir extends js.Object {
  def Buffer(): java.lang.String
  def `Buffer.isBuffer`(file: java.lang.String): java.lang.String
  def __dirname(file: java.lang.String, basedir: java.lang.String): java.lang.String
  def __filename(file: java.lang.String, basedir: java.lang.String): java.lang.String
  def global(): java.lang.String
  def process(file: java.lang.String): java.lang.String
}

object Anon_Basedir {
  @scala.inline
  def apply(
    Buffer: js.Function0[java.lang.String],
    `Buffer.isBuffer`: js.Function1[java.lang.String, java.lang.String],
    __dirname: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    __filename: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    global: js.Function0[java.lang.String],
    process: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Basedir = {
    val __obj = js.Dynamic.literal(Buffer = Buffer, __dirname = __dirname, __filename = __filename, global = global, process = process)
    __obj.updateDynamic("Buffer.isBuffer")(`Buffer.isBuffer`)
    __obj.asInstanceOf[Anon_Basedir]
  }
}

