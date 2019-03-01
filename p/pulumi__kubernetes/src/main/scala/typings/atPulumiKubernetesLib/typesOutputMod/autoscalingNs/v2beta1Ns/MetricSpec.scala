package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetricSpec specifies how to scale based on a single metric (only `type` and one other
  * matching field should be set at once).
  */
trait MetricSpec extends js.Object {
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It
    * allows autoscaling based on information coming from components running outside of cluster
    * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
    * outside of cluster).
    */
  val external: ExternalMetricSource
  /**
    * object refers to a metric describing a single kubernetes object (for example,
    * hits-per-second on an Ingress object).
    */
  val `object`: ObjectMetricSource
  /**
    * pods refers to a metric describing each pod in the current scale target (for example,
    * transactions-processed-per-second).  The values will be averaged together before being
    * compared to the target value.
    */
  val pods: PodsMetricSource
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known
    * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
    * metrics are built in to Kubernetes, and have special scaling options on top of those
    * available to normal per-pod metrics using the "pods" source.
    */
  val resource: ResourceMetricSource
  /**
    * type is the type of metric source.  It should be one of "Object", "Pods" or "Resource",
    * each mapping to a matching field in the object.
    */
  val `type`: java.lang.String
}

object MetricSpec {
  @scala.inline
  def apply(
    external: ExternalMetricSource,
    `object`: ObjectMetricSource,
    pods: PodsMetricSource,
    resource: ResourceMetricSource,
    `type`: java.lang.String
  ): MetricSpec = {
    val __obj = js.Dynamic.literal(external = external, `object` = `object`, pods = pods, resource = resource, `type` = `type`)
  
    __obj.asInstanceOf[MetricSpec]
  }
}

