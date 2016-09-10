/**
 * 
 */
angular.module('HelloPolpo', ['ui.grid', 'ui.grid.edit', 'ui.grid.cellNav', 'ui.grid.pinning', 'ui.grid.resizeColumns', 'ui.grid.exporter', 'ui.grid.selection', 'ui.grid.pagination', 'ui.grid.moveColumns', 'ui.grid.saveState'])
.factory('helloAjax', [function () {
    return function (_$scope, onGotcha) {
    	var p2 = {
			age: 18,
			sex: "male"
		};
		$.ajax({
	        type: "POST",
	        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
	        url: "helloajax",
	        data: {
	        	p1: "Sam Lin",
	        	p2: JSON.stringify(p2)
	        },
	        dataType: "json",
	        processData: true,
	        beforeSend: function (jqXHR, settings) {
	        },
	        success: function (data, textStatus, jqXHR) {
	        	onGotcha.apply({}, [_$scope, data]);
	        },
	        error: function (jqXHR, textStatus, errorThrown) {
	        },
	        complete: function (jqXHR, textStatus) {
	        }
		});
    };
}])
.factory('getData', [function () {
    return function (_$scope, onGotcha) {
    	$.ajax({
	        type: "POST",
	        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
	        url: "getData",
	        data: null,
	        dataType: "json",
	        processData: true,
	        beforeSend: function (jqXHR, settings) {
	        },
	        success: function (data, textStatus, jqXHR) {
	        	onGotcha.apply({}, [_$scope, data]);
	        },
	        error: function (jqXHR, textStatus, errorThrown) {
	        },
	        complete: function (jqXHR, textStatus) {
	        }
		});
    };
}])
.controller('MainCtrl', ['$scope', 'helloAjax', 'getData', function ($scope, helloAjax, getData) {
	$scope.message = '';
	$scope.helloAjax = function () {
		helloAjax($scope, function (_$scope, data) {
			console.log(data);
        });
    };
    $scope.gridOptions = {
        enableSorting: true,
//        enableCellEditOnFocus: true,
        enableFiltering: true,
        enableGridMenu: true,
        enableRowSelection: false,
        enableRowHeaderSelection: false,
        paginationPageSizes: [1000, 5000, 10000, 100000, 1000000],
        paginationPageSize: 1000000,
        saveFocus: false,
        saveSelection: false,
        onRegisterApi: function (gridApi) {
            $scope.gridApi = gridApi;
//            gridApi.core.on.rowsRendered($scope, function () {
//                if (!$scope.loadedUserSettings) {
//                    $scope.loadedUserSettings = true;
//                    if (userSettings && userSettings.key) {
//                        $scope.gridApi.saveState.restore($scope, userSettings.key);
//                        $scope.gridApi.core.notifyDataChange(uiGridConstants.dataChange.ALL);
//                    }
//                    $scope.gridState = JSON.stringify(gridApi.saveState.save());
//                    var userSettingsWatcher = function () {
//                        var timer = setInterval(function () {
//                            var gridState = JSON.stringify(gridApi.saveState.save());
//                            if (gridState != $scope.gridState) {
//                                //console.log('old:' + _$scope.gridState);
//                                //console.log('new:' + gridState);
//                                saveUserSettings($scope, 'key', gridState, function (_$scope, data) {
//                                    //console.log('SaveUserSettings:' + JSON.stringify(data));
//                                    _$scope.gridState = gridState;
//                                    userSettingsWatcher();
//                                });
//                                clearInterval(timer);
//                            }
//                        }, 1 * 1000);
//                    };
//                    userSettingsWatcher();
//                }
//            });
//            var cellTemplate = 'ui-grid/selectionRowHeader';   // you could use your own template here
            $scope.gridApi.core.addRowHeaderColumn({ name: 'rowHeaderCol', displayName: '', width: 50, cellTemplate: '<div class="ui-grid-cell-contents" style={{row.cssDirty}}>{{grid.renderContainers.body.visibleRowCache.indexOf(row) + 1}}</div>' });
//            gridApi.cellNav.on.navigate($scope, function (newRowCol, oldRowCol) {
//                //console.log(newRowcol);
//                //console.log(gridApi.cellNav.getCurrentSelection());
//                if ($scope.ignoreNavi) {
//                    $scope.ignoreNavi = false;
//                    return;
//                }
//                if (newRowCol.col.name == 'ModelFcstQty') {
//                    if (!newRowCol.row.entity.ModelFcstQty || newRowCol.row.entity.ModelFcstQty == 0) {
//                        $scope.makeCarried(newRowCol.row.entity, 1);
//                    }
//                }
//                $scope.isDirty(newRowCol.row.entity);
//            });
//            $scope.gridApi.edit.on.afterCellEdit($scope, function (rowEntity, colDef, newValue, oldValue) {
//                //console.log(colDef);
//                if (!rowEntity.ModelFcstQty || rowEntity.ModelFcstQty == 0) {
//                    $scope.makeUnCarried(rowEntity);
//                }
//                $scope.isDirty(rowEntity);
//                //prevent auto-carry next model
//                $scope.ignoreNavi = true;
//            });
//            gridApi.cellNav.on.viewPortKeyDown($scope, function (event, rowCol) {
//                console.log(event);
//            });
//            gridApi.cellNav.on.viewPortKeyPress($scope, function (event, rowCol) {
//                console.log(event);
//            });
        },
        columnDefs: [
          { name: 'framework', filed: 'framework', displayName: 'Library/Framework/Platform', enableSorting: true, enableCellEdit: true },
          { name: 'language', filed: 'language', displayName: 'Language', enableSorting: true, enableCellEdit: true },
          { name: 'description', field: 'description', displayName: 'Description', enableSorting: true, enableCellEdit: true }
//          { name: 'Carried', field: 'Carried()', displayName: 'Carried', type: 'boolean', enableCellEdit: false },
//          { name: 'Carried', displayName: 'Carried', type: 'boolean', enableCellEdit: false, cellTemplate: '<input type="checkbox" ng-model="row.entity.ModelFcstQty > 0 ? true : false">' },
        ]
    };
    $scope.getData = function() {
    	getData($scope, function(_scope, data) {
    		//console.log(data);
    		$scope.gridOptions.data = data.p1;
            $scope.gridApi.grid.refresh();
    	});
    };
}]);
