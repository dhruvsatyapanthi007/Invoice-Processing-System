import { Box, Button, TextField, Typography, styled } from "@mui/material";
import { useState } from "react";
import { addToDB } from "../services/api";

const InvoiceWrapper = styled(Box)({
	marginTop: 20,
	"& > p": {
		fontSize: 26,
		marginBottom: 10,
	},

	"& > div > div": {
		marginRight: 20,
		minWidth: 200,
	},
});

const defaultObj = {
	vendor: "",
	product: "",
	amount: 0,
	date: "",
	action: "pending",
};

const AddInvoice = () => {
	const [invoice, setInvoice] = useState(defaultObj);
	const handleChange = (e) => {
		setInvoice({ ...invoice, [e.target.name]: e.target.value });
	};

	const addNewInvoice = async () => {
		await addToDB({ ...invoice, amount: Number(invoice["amount"]) });
	};

	return (
		<InvoiceWrapper>
			<Typography>Add Invoice</Typography>
			<Box>
				<TextField
					variant="standard"
					placeholder="Enter vendor name"
					name="vendor"
					onChange={handleChange}
				/>
				<TextField
					variant="standard"
					placeholder="Enter product name"
					name="product"
					onChange={handleChange}
				/>
				<TextField
					variant="standard"
					placeholder="Enter amount"
					type="number"
					name="amount"
					onChange={handleChange}
				/>
				<TextField
					variant="standard"
					placeholder="Enter date"
					type="date"
					name="date"
					onChange={handleChange}
				/>
				<Button variant="contained" onClick={() => addNewInvoice()}>
					Add Invoice
				</Button>
			</Box>
		</InvoiceWrapper>
	);
};

export default AddInvoice;
