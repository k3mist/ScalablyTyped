package typings
package atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTypeDefinition
  extends ProtobufTypeDefinition
     with AnyDefinition {
  @JSName("format")
  var format_MessageTypeDefinition: atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderLibStrings.`Protocol Buffer 3 DescriptorProto`
}

object MessageTypeDefinition {
  @scala.inline
  def apply(
    fileDescriptorProtos: js.Array[nodeLib.Buffer],
    format: atGrpcProtoDashLoaderLib.atGrpcProtoDashLoaderLibStrings.`Protocol Buffer 3 DescriptorProto`,
    `type`: js.Object
  ): MessageTypeDefinition = {
    val __obj = js.Dynamic.literal(fileDescriptorProtos = fileDescriptorProtos, format = format, `type` = `type`)
  
    __obj.asInstanceOf[MessageTypeDefinition]
  }
}

