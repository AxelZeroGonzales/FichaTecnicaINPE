 angular.module('todoAp', [])
  .controller('ControladorTareas', ['$scope', function($scope) {
    
    var ctrl = this;
    
  ctrl.tareas = [];
                   
  ctrl.agregarTarea = function() {
    ctrl.tareas.push({texto: ctrl.textoNuevaTarea, hecho: false});
    ctrl.textoNuevaTarea = '';
  };

  ctrl.restantes = function() {
    var cuenta = 0;
    angular.forEach(ctrl.tareas, function(tarea) {
      cuenta += tarea.hecho ? 0 : 1;
    });
    return cuenta;
  };

  ctrl.eliminar = function() {
    var tareasViejas = ctrl.tareas;
    ctrl.tareas = [];
    angular.forEach(tareasViejas, function(tarea) {
      if (!tarea.hecho) ctrl.tareas.push(tarea);
    });
  };
}]);