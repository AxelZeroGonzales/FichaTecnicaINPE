angular.module('todoAp', [])
        .controller('ControladorTareas', ['$scope', function ($scope) {

                var ctrl = this;
                var b = 1;
                ctrl.tareas = [];
                ctrl.tareas1 = [];
                ctrl.tareas2 = [];
                ctrl.tareas3 = [];
                ctrl.tareas4 = [];
                ctrl.tareas5 = [];
                if (b < 2) {
                    b = b + 1;
                    ctrl.agregarTarea = function () {
                        ctrl.tareas.push({});
                        ctrl.textoNuevaTarea = '';

                    };
                } else {
                    ctrl.eliminar = function () {
                        var tareasViejas = ctrl.tareas;
                        ctrl.tareas = [];
                        angular.forEach(tareasViejas, function (tarea) {

                            ctrl.tareas.push(tarea);
                        });
                    };
                }
                ;




                ctrl.agregarTarea2 = function () {
                    ctrl.tareas1.push({});
                    ctrl.textoNuevaTarea = '';
                };
                ctrl.agregarTarea3 = function () {
                    ctrl.tareas2.push({});
                    ctrl.textoNuevaTarea = '';
                };
                ctrl.agregarTarea4 = function () {
                    ctrl.tareas3.push({});
                    ctrl.textoNuevaTarea = '';
                };
                ctrl.agregarTarea5 = function () {
                    ctrl.tareas4.push({});
                    ctrl.textoNuevaTarea = '';
                };
                ctrl.agregarTares6 = function () {
                    ctrl.tareas5.push({});
                    ctrl.textoNuevaTarea = '';
                };

                $scope.formVisibility = false;
                $scope.formVisibility1 = true;

                $scope.ShowForm = function () {
                    $scope.formVisibility = true;
                    $scope.formVisibility1 = false;                    
                    console.log($scope.formVisibility)
                }
                $scope.Save = function () {
                    $scope.formVisibility = false;
                    $scope.formVisibility1 = true;                    
                    console.log($scope.formVisibility)
                }



            }]);