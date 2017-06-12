package test

import scala.meta._

class AnnotationWithType[SomeType] extends scala.annotation.StaticAnnotation {

  inline def apply(defn: Any): Any = meta {
    defn
  }
}
