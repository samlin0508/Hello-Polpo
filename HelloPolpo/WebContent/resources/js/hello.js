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
.controller('MainCtrl', ['$scope', 'helloAjax', function ($scope, helloAjax) {
	$scope.helloAjax = function () {
		helloAjax($scope, function (_$scope, data) {
			console.log(data);
        });
    };
    $scope.gridOptions = {
        enableSorting: true,
        //enableCellEditOnFocus: true,
        enableFiltering: true,
        enableGridMenu: true,
        enableRowSelection: true,
        enableRowHeaderSelection: false,
        paginationPageSizes: [1000, 5000, 10000, 100000, 1000000],
        paginationPageSize: 1000000,
        onRegisterApi: function (gridApi) {
            $scope.gridApi = gridApi;
            //var cellTemplate = 'ui-grid/selectionRowHeader';   // you could use your own template here
            var cellTemplate = '<div class="ui-grid-cell-contents">{{grid.renderContainers.body.visibleRowCache.indexOf(row) + 1}}</div>';
            $scope.gridApi.core.addRowHeaderColumn({ name: 'rowHeaderCol', displayName: '', width: 50, cellTemplate: cellTemplate });
            gridApi.cellNav.on.navigate($scope, function (newRowcol, oldRowCol) {
                alert(newRowcol);
            });
        },
        columnDefs: [
          { name: 'ItemGroupObjId', filed: 'ItemGroupObjId', enableSorting: true, enableCellEdit: false },
          { name: 'ItemGroupName', filed: 'ItemGroupName', enableSorting: true, enableCellEdit: false },
          { name: 'Area', field: 'Area', enableSorting: true, enableCellEdit: false },
          { name: 'ModelYear', field: 'ModelYear', enableSorting: true, enableCellEdit: false },
          { name: 'LaunchTime', field: 'LaunchTime', enableSorting: true, enableCellEdit: false },
          { name: 'FrameGMC', field: 'FrameGMC', enableSorting: true, enableCellEdit: false },
          { name: 'AssemblyGMC', field: 'AssemblyGMC', enableSorting: true, enableCellEdit: false },
          { name: 'Color', field: 'Color', enableSorting: true, enableCellEdit: false },
          { name: 'ApprovedCarryingGSCs', field: 'ApprovedCarryingGSCs', enableSorting: true, enableCellEdit: false },
          { name: 'BusinessTypeName', field: 'BusinessTypeName', enableSorting: true, enableCellEdit: false },
          { name: 'Brand', field: 'Brand', enableSorting: true, enableCellEdit: false },
          { name: 'Gender', field: 'Gender', enableSorting: true, enableCellEdit: false },
          { name: 'Surface', field: 'Surface', enableSorting: true, enableCellEdit: false },
          { name: 'Lvl', field: 'Lvl', enableSorting: true, enableCellEdit: false },
          { name: 'Sizes', field: 'Sizes', enableSorting: true, enableCellEdit: false },
          { name: 'MaterialCode', field: 'MaterialCode', enableSorting: true, enableCellEdit: false },
          { name: 'Speed', field: 'Speed', enableSorting: true, enableCellEdit: false },
          { name: 'WheelSize', field: 'WheelSize', enableSorting: true, enableCellEdit: false },
          { name: 'IsSample', field: 'IsSample', enableSorting: true, enableCellEdit: false },
          { name: 'BrakeDirection', field: 'BrakeDirection', enableSorting: true, enableCellEdit: false },
          { name: 'SBU', field: 'SBU', displayName: 'SBU', enableCellEdit: false },
          //{ name: 'Carried', field: 'Carried()', displayName: 'Carried', type: 'boolean', enableCellEdit: false },
          //{ name: 'Carried', displayName: 'Carried', type: 'boolean', enableCellEdit: false, cellTemplate: '<input type="checkbox" ng-model="row.entity.ModelFcstQty > 0 ? true : false">' },
          { name: 'ModelFcstQty', field: 'ModelFcstQty', enableSorting: true, enableCellEdit: true }
        ],
        data: [{
        	ItemGroupName: 'Sam Lin'
        }]
    };
}]);