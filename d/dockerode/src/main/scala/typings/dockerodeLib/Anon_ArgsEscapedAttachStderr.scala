package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsEscapedAttachStderr extends js.Object {
  var ArgsEscaped: scala.Boolean
  var AttachStderr: scala.Boolean
  var AttachStdin: scala.Boolean
  var AttachStdout: scala.Boolean
  var Cmd: js.Array[java.lang.String]
  var Domainname: java.lang.String
  var Entrypoint: js.UndefOr[js.Any] = js.undefined
  var Env: js.Array[java.lang.String]
  var ExposedPorts: org.scalablytyped.runtime.StringDictionary[js.Object]
  var Hostname: java.lang.String
  var Image: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var OnBuild: js.Array[_]
  var OpenStdin: scala.Boolean
  var StdinOnce: scala.Boolean
  var Tty: scala.Boolean
  var User: java.lang.String
  var Volumes: org.scalablytyped.runtime.StringDictionary[js.Object]
  var WorkingDir: java.lang.String
}

object Anon_ArgsEscapedAttachStderr {
  @scala.inline
  def apply(
    ArgsEscaped: scala.Boolean,
    AttachStderr: scala.Boolean,
    AttachStdin: scala.Boolean,
    AttachStdout: scala.Boolean,
    Cmd: js.Array[java.lang.String],
    Domainname: java.lang.String,
    Env: js.Array[java.lang.String],
    ExposedPorts: org.scalablytyped.runtime.StringDictionary[js.Object],
    Hostname: java.lang.String,
    Image: java.lang.String,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    OnBuild: js.Array[_],
    OpenStdin: scala.Boolean,
    StdinOnce: scala.Boolean,
    Tty: scala.Boolean,
    User: java.lang.String,
    Volumes: org.scalablytyped.runtime.StringDictionary[js.Object],
    WorkingDir: java.lang.String,
    Entrypoint: js.Any = null
  ): Anon_ArgsEscapedAttachStderr = {
    val __obj = js.Dynamic.literal(ArgsEscaped = ArgsEscaped, AttachStderr = AttachStderr, AttachStdin = AttachStdin, AttachStdout = AttachStdout, Cmd = Cmd, Domainname = Domainname, Env = Env, ExposedPorts = ExposedPorts, Hostname = Hostname, Image = Image, Labels = Labels, OnBuild = OnBuild, OpenStdin = OpenStdin, StdinOnce = StdinOnce, Tty = Tty, User = User, Volumes = Volumes, WorkingDir = WorkingDir)
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint)
    __obj.asInstanceOf[Anon_ArgsEscapedAttachStderr]
  }
}

